package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Cursor;
import java.awt.Dimension;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//uso da biblioteca flatlaf
		FlatLightLaf.setup();
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/img/pdv.png")));
		setResizable(false);
		setTitle("MUSIC-PDV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.setBounds(new Rectangle(15, 15, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(3, 36, 75));
		panel.setBounds(0, 0, 172, 522);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 23, 64, 64);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/img/shopping-basket_64x64.png")));
		
		JLabel lblNewLabel_1 = new JLabel("MUSIC-PDV");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(78, 33, 80, 34);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Sistema de PDV");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(78, 63, 92, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnFornecedores = new JButton("Fornecedores");
		btnFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFornecedor fornecedor = new frmFornecedor();
				fornecedor.setVisible(true);
			}
		});
		btnFornecedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFornecedores.setHorizontalAlignment(SwingConstants.LEFT);
		btnFornecedores.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnFornecedores.putClientProperty("JButton.arc", 300);
		btnFornecedores.setBackground(new Color(27, 52, 87));
		btnFornecedores.setForeground(new Color(255, 255, 255));
		btnFornecedores.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFornecedores.setBorder(null);
		btnFornecedores.setIconTextGap(14);
		btnFornecedores.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnFornecedores.setBounds(10, 111, 148, 49);
		panel.add(btnFornecedores);
		
		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProdutos.setHorizontalAlignment(SwingConstants.LEFT);
		btnProdutos.setIconTextGap(14);
		btnProdutos.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnProdutos.setForeground(Color.WHITE);
		btnProdutos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnProdutos.setBorder(null);
		btnProdutos.setBackground(new Color(27, 52, 87));
		btnProdutos.setBounds(10, 171, 148, 49);
		panel.add(btnProdutos);
		
		JButton btnPDV = new JButton("PDV");
		btnPDV.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPDV.setHorizontalAlignment(SwingConstants.LEFT);
		btnPDV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPDV.setIconTextGap(14);
		btnPDV.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnPDV.setForeground(Color.WHITE);
		btnPDV.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPDV.setBorder(null);
		btnPDV.setBackground(new Color(27, 52, 87));
		btnPDV.setBounds(10, 231, 148, 49);
		panel.add(btnPDV);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVendas.setHorizontalAlignment(SwingConstants.LEFT);
		btnVendas.setIconTextGap(14);
		btnVendas.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnVendas.setForeground(Color.WHITE);
		btnVendas.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVendas.setBorder(null);
		btnVendas.setBackground(new Color(27, 52, 87));
		btnVendas.setBounds(10, 291, 148, 49);
		panel.add(btnVendas);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.setHorizontalAlignment(SwingConstants.LEFT);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja relamente sair do sistema?", "Confirmar saída", JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					System.exit(0); //encerra sistema
				}
			}
		});
		btnSair.setIconTextGap(14);
		btnSair.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSair.setBorder(null);
		btnSair.setBackground(new Color(27, 52, 87));
		btnSair.setBounds(10, 351, 148, 49);
		panel.add(btnSair);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			//ativar a tela sobre
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setHorizontalAlignment(SwingConstants.LEFT);
		btnSobre.setIconTextGap(14);
		btnSobre.setIcon(new ImageIcon(Main.class.getResource("/img/fornecedores_32x32.png")));
		btnSobre.setForeground(Color.WHITE);
		btnSobre.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSobre.setBorder(null);
		btnSobre.setBackground(new Color(27, 52, 87));
		btnSobre.setBounds(10, 438, 148, 49);
		panel.add(btnSobre);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(160, 160, 160)));
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBounds(0, 521, 784, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("MySQL Desconectado");
		lblNewLabel_3.setBounds(38, 14, 118, 15);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("●");
		lblNewLabel_4.setPreferredSize(new Dimension(9, 15));
		lblNewLabel_4.setSize(new Dimension(9, 9));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(157, 13, 10, 16);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setForeground(SystemColor.controlHighlight);
		panel_2.setBounds(172, 0, 612, 522);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lblData = new JLabel("");
		lblData.setBounds(520, 16, 63, 22);
		panel_2.add(lblData);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 318, 592, 193);
		panel_2.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 192, 183, 115);
		panel_2.add(panel_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(213, 192, 183, 115);
		panel_2.add(panel_4_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBounds(419, 192, 183, 115);
		panel_2.add(panel_4_1_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBounds(10, 57, 183, 115);
		panel_2.add(panel_4_2);
		
		JPanel panel_4_2_1 = new JPanel();
		panel_4_2_1.setBounds(213, 57, 183, 115);
		panel_2.add(panel_4_2_1);
		
		JPanel panel_4_2_1_1 = new JPanel();
		panel_4_2_1_1.setBounds(419, 57, 183, 115);
		panel_2.add(panel_4_2_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Dashboard");
		lblNewLabel_5.setBounds(85, 11, 82, 33);
		panel_2.add(lblNewLabel_5);
		
		//inciar centralizado
		setLocationRelativeTo(null);
		
		//iniciar tela cheia
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		atualizarData();
		

	}//Fim do construtor
	
	//Função (método) para atualizar a data do sistema
	private void atualizarData() {
		//obter a data da sistema
		LocalDate hoje = LocalDate.now();
		//formatar a data
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//alterar o texto de lblData
		lblData.setText(hoje.format(formato));
		
	}
}//Fim da classe Main
