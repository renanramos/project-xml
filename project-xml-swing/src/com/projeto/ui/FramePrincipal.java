package com.projeto.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projeto.entity.generated.Dispositivo;
import com.projeto.service.DispositivoService;
import com.projeto.ui.constants.InfoConstants;
import com.projeto.util.xml.ParserXml;

@Component
public class FramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private DispositivoService dispositivoService;
	
	private JLabel lbUrl;
	private JTextField txtUrl;
	private JButton btnConectar;
	private JButton btnSair;

	public FramePrincipal() {
		this.setTitle("Projeto XML");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.init();
		this.setVisible(true);
	}

	//Inicializa os componentes para a tela principal do software
	private void init() {
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.add(initComponentesDadosConexao(), BorderLayout.NORTH);
		panelPrincipal.add(initBotoesDeAcesso(), BorderLayout.CENTER);
				
		this.add(panelPrincipal);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);

		layout.setHorizontalGroup(layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(panelPrincipal, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		layout.setVerticalGroup(layout.createParallelGroup(
				GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(panelPrincipal, GroupLayout.DEFAULT_SIZE,
								GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
	}

	private JPanel initBotoesDeAcesso() {
		JPanel panelBotoesAcesso = new JPanel();
		panelBotoesAcesso.setLayout(new FlowLayout());

		btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ConectarActionListener());
	
		btnSair = new JButton("Sair");

		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		panelBotoesAcesso.add(btnConectar);
		panelBotoesAcesso.add(btnSair);

		return panelBotoesAcesso;
	}

	private JPanel initComponentesDadosConexao() {
		JPanel panelDadosConexao = new JPanel();
		panelDadosConexao.setLayout(new GridLayout(4, 2));

		lbUrl = new JLabel("URL: ");

		txtUrl = new JTextField();

		panelDadosConexao.add(lbUrl);
		panelDadosConexao.add(txtUrl);

		return panelDadosConexao;
	}

	private class ConectarActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String url = txtUrl.getText();
			if (!url.isEmpty()) {
				try {
					ParserXml parserXml = new ParserXml();
					Dispositivo dispositivo = new Dispositivo();
					dispositivo = (Dispositivo) parserXml.obtemConteudoXML(url, dispositivo);					
					if (dispositivoService.getDispositivoById(dispositivo.getId()) == null){						
						dispositivoService.createDispositivo(dispositivo);												
						JOptionPane.showMessageDialog(rootPane, InfoConstants.SUCCESS);
					}else{
						JOptionPane.showMessageDialog(rootPane, InfoConstants.ERROR_ITEM_EXISTENTE);
					}
				} catch (JAXBException ex) {
					JOptionPane.showMessageDialog(rootPane, InfoConstants.ERRO_JAXB + ex.getLocalizedMessage());					
				} catch (MalformedURLException ex) {
					JOptionPane.showMessageDialog(rootPane, InfoConstants.ERRO_URL_INCORRETA + ex.getLocalizedMessage());
				}finally{
					limpaCampo();
				}
			} else {
				JOptionPane.showMessageDialog(rootPane,
						InfoConstants.ERRO_CAMPOS_VAZIOS);
			}
		}
	}
	
	public void limpaCampo(){
		txtUrl.setText("");
	}
	

}
