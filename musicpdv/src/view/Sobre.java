package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import java.net.URI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setResizable(false);
		setModal(true);
		setTitle("Sobre");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblMUSICPDV = new JLabel("MUSIC-PDV");
		lblMUSICPDV.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMUSICPDV.setBounds(27, 52, 133, 24);
		getContentPane().add(lblMUSICPDV);
		
		JLabel lblDescricao = new JLabel("Sistema para gestão de estoque e PDV.");
		lblDescricao.setBounds(27, 87, 220, 14);
		getContentPane().add(lblDescricao);
		
		JLabel lblAuthor = new JLabel("Author Matheus Jade Esseyah");
		lblAuthor.setBounds(27, 112, 220, 14);
		getContentPane().add(lblAuthor);
		
		JLabel lblVersao = new JLabel("Versão 1.0");
		lblVersao.setBounds(27, 137, 70, 14);
		getContentPane().add(lblVersao);
		
		JLabel lblMit = new JLabel("");
		lblMit.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit.png")));
		lblMit.setBounds(333, 52, 64, 64);
		getContentPane().add(lblMit);
		
		JLabel lblGithub = new JLabel("");
		lblGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		lblGithub.setBounds(27, 162, 32, 32);
		getContentPane().add(lblGithub);
		
		JLabel lblRepositorio = new JLabel("github.com/matheusjesseyah");
		lblRepositorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://github.com/matheusjesseyah");
			}
		});
		lblRepositorio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRepositorio.setForeground(new Color(0, 0, 255));
		lblRepositorio.setBounds(69, 173, 204, 14);
		getContentPane().add(lblRepositorio);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//fechar aperas o sobre
				dispose();
			}
		});
		btnOk.setBounds(306, 202, 89, 23);
		getContentPane().add(btnOk);
		
		setLocationRelativeTo(null);

	}
	
	//funçõa (método) para abrir um link no navegador padrão
	private void link(String url) {
		//obter o desktop do cliente
		Desktop desktop = Desktop.getDesktop();
		//uso de try catch
		try {
			URI uri = new URI(url);
			//abrir o link no navigador padrão do cliente
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
}
