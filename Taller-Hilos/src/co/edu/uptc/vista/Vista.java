package co.edu.uptc.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import co.edu.uptc.model.Hilo;
import co.edu.uptc.model.Routes;
import co.edu.uptc.model.Source;


public class Vista extends JFrame {

	private JLabel salida;
    public JProgressBar progress1;
    public JProgressBar progress2;
    public JProgressBar progress3;
    public JProgressBar progress4;
    public JProgressBar progress5;
    private JButton buscar;
    private JButton cargar;
    private JTextField entrada;
    private JLabel destino;
    public JLabel porcentaje_1;
    public JLabel porcentaje_2;
    public JLabel porcentaje_3;
    public JLabel porcentaje_4;
    public JLabel porcentaje_5;
    private JLabel resultado;
    private JLabel text1;
    private JLabel text2;
    private JLabel text3;
    private JLabel text4;
    private JLabel text5;
    private JLabel Destinos;
    
    public Vista() {
        initComponents();
    }

    
    private void initComponents() {

        porcentaje_1 = new JLabel();
        progress1 = new JProgressBar();
        progress2 = new JProgressBar();
        porcentaje_2 = new JLabel();
        progress3 = new JProgressBar();
        porcentaje_3 = new JLabel();
        cargar = new JButton();
        text1 = new JLabel();
        text2 = new JLabel();
        text3 = new JLabel();
        text4 = new JLabel();
        porcentaje_4 = new JLabel();
        progress4 = new JProgressBar();
        progress5 = new JProgressBar();
        porcentaje_5 = new JLabel();
        text5 = new JLabel();
        destino = new JLabel();
        entrada = new JTextField();
        buscar = new JButton();
        resultado = new JLabel();
        salida = new JLabel();
        Destinos = new JLabel();
        setBounds(150, 150, 700, 850);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
 

        porcentaje_1.setBackground(new java.awt.Color(153, 153, 153));
        porcentaje_1.setFont(new java.awt.Font("Verdana", 1, 20)); 
        porcentaje_1.setText("0%");
        porcentaje_1.setBounds(530, 160, 80, 60);
        getContentPane().add(porcentaje_1);
        progress1.setBackground(new java.awt.Color(153, 153, 153));
        progress1.setBounds(120, 230, 500, 40);
        getContentPane().add(progress1);
        
        text1.setText("-----");
        text1.setFont(new java.awt.Font("Verdana", 1, 20));
        text1.setBounds(120, 180, 120, 30);
       
        
        porcentaje_2.setBackground(new java.awt.Color(153, 153, 153));
        porcentaje_2.setFont(new java.awt.Font("Verdana", 1, 20)); 
        porcentaje_2.setText("0%");
        porcentaje_2.setBounds(530, 272, 80, 60);
        getContentPane().add(porcentaje_2);
        
        progress2.setBackground(new java.awt.Color(153, 153, 153));
        progress2.setBounds(120, 342, 500, 40);
        getContentPane().add(progress2);
        
      
    
        porcentaje_3.setBackground(new java.awt.Color(153, 153, 153));
        porcentaje_3.setFont(new java.awt.Font("Verdana", 1, 20)); 
        porcentaje_3.setText("0%");
        porcentaje_3.setBounds(530, 383, 80, 60);
        getContentPane().add(porcentaje_3);
        
        progress3.setBackground(new java.awt.Color(153, 153, 153));
        progress3.setBounds(120, 452, 500, 40);
        getContentPane().add(progress3);
        
        
    
        porcentaje_4.setBackground(new java.awt.Color(153, 153, 153));
        porcentaje_4.setFont(new java.awt.Font("Verdana", 1, 20)); 
        porcentaje_4.setText("0%");
        porcentaje_4.setBounds(530, 504, 80, 60);
        getContentPane().add(porcentaje_4);
        
        progress4.setBackground(new java.awt.Color(153, 153, 153));
        progress4.setBounds(120, 572, 500, 40);
        getContentPane().add(progress4);
        
        

        porcentaje_5.setBackground(new java.awt.Color(153, 153, 153));
        porcentaje_5.setFont(new java.awt.Font("Verdana", 1, 20)); 
        porcentaje_5.setText("0%");
        porcentaje_5.setBounds(530, 625, 80, 60);
        getContentPane().add(porcentaje_5);
        
        progress5.setBackground(new java.awt.Color(153, 153, 153));
        progress5.setBounds(120, 692, 500, 40);
        getContentPane().add(progress5);
        
        
     
        cargar.setText("Cargar");
        
        salida.setFont(new java.awt.Font("Verdana", 1, 12));
        salida.setBounds(80, 100, 600, 30);
        getContentPane().add(salida);

        buscar.setText("Buscar");
        buscar.setBounds(120, 40, 80, 30);
        getContentPane().add(buscar);
        buscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				Buscar(a);
				

			}
		});
        
        
        entrada.setBounds(260, 40, 260, 35);
        getContentPane().add(entrada);
        
        destino.setText("DESTINO");
        destino.setFont(new java.awt.Font("Dialog", 1, 16));
        destino.setBounds(350, 10, 180, 35);
        getContentPane().add(destino);
        
        Destinos.setText("RUTAS AEREAS : Bogota - Ecuador - Chile - Madrid - Paris - Lima");
        Destinos.setFont(new java.awt.Font("Dialog", 1, 12));
        Destinos.setBounds(150, 68, 380, 35);
        getContentPane().add(Destinos);
        
        
    }

    private void Buscar(ActionEvent ae) {
    	List <Source> sources = new ArrayList();
    	if(ae.getSource().equals(buscar))
        {
     	   Source sou_1 = new Source();
            sou_1=sou_1.leer("Enlaces.json");
            Source sou_2 = new Source();
            sou_2=sou_2.leer("EnlaceUno.json");
            Source sou_3 = new Source();
            sou_3=sou_3.leer("EnlaceDos.json");
            
            Source sou_4 = new Source();
            sou_4=sou_4.leer("EnlaceTres.json");
            Source sou_5 = new Source();
            sou_5=sou_5.leer("EnlaceCuatro.json");
            sources.add(sou_1);
            sources.add(sou_2);
            sources.add(sou_3);
            sources.add(sou_4);
            sources.add(sou_5);
            
            Hilo thread_1 = new Hilo(sou_1,porcentaje_1,text1,progress1);
            Hilo thread_2 = new Hilo(sou_2,porcentaje_2,text2,progress2);
            Hilo thread_3 = new Hilo(sou_3,porcentaje_3,text3,progress3);
            Hilo thread_4 = new Hilo(sou_4,porcentaje_4,text4,progress4);
            Hilo thread_5 = new Hilo(sou_5,porcentaje_5,text5,progress5);
            thread_1.start();
            thread_2.start();
            thread_3.start();
            thread_4.start();
            thread_5.start();
            
           
            
              String Salida = "Sin Resultados";
            for(Source sou : sources )
            {
                                            
                    for (Routes ts : sou.getTargets())
                    {
                 	   
                        try{
                     	   System.out.println(ts.getTarget());   
                            
                        if(ts.getTarget().equalsIgnoreCase(entrada.getText()))	{
                        Salida="Salida: " + sou.getSource();
                        Salida+= "  Lugar Destino: "+ts.getTarget()+" - Distancia Total: "+ts.getDistance()+" - Valor: "+ts.getValue();}
                        }catch(Exception e )
                        {
                            
                        }
                    }
                   
             }
            	
 				
 			
           
 				salida.setText(Salida);
 			
                    
        }
    }

    
}
