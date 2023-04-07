package quebracabeca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

public class QuebraCabeca{
    
    private int jogadas = 0;
    private int h, m, s;
    private Timer timer;
    
    public void mudar(JButton bApertado, JButton b1, JButton b2, JLabel temp){
        if(b1.getText().equals("")){
            jogadas++;
            if(jogadas==1){
                comecarTemp(temp);
            }
            b1.setText(bApertado.getText());
            bApertado.setText("");
        }else if(b2.getText().equals("")){
            jogadas++;
            if(jogadas==1){
                comecarTemp(temp);
            }
            b2.setText(bApertado.getText());
            bApertado.setText("");
        }  
    }
    
    public void mudar(JButton bApertado, JButton b1, JButton b2, JButton b3, JLabel temp){
        if(b1.getText().equals("")){
            jogadas++;
            if(jogadas==1){
                comecarTemp(temp);
            }
            b1.setText(bApertado.getText());
            bApertado.setText("");
        }else if(b2.getText().equals("")){
            jogadas++;
            if(jogadas==1){
                comecarTemp(temp);
            }
            b2.setText(bApertado.getText());
            bApertado.setText("");
        }else if(b3.getText().equals("")){
            jogadas++;
            if(jogadas==1){
                comecarTemp(temp);
            }
            b3.setText(bApertado.getText());
            bApertado.setText("");
        } 
    }
    
    public void mudar(JButton bApertado, JButton b1, JButton b2, JButton b3, JButton b4, JLabel temp){
        if(b1.getText().equals("")){
            jogadas++;
            if(jogadas==1){
                comecarTemp(temp);
            }
            b1.setText(bApertado.getText());
            bApertado.setText("");
        }else if(b2.getText().equals("")){
            jogadas++;
            if(jogadas==1){
                comecarTemp(temp);
            }
            b2.setText(bApertado.getText());
            bApertado.setText("");
        }else if(b3.getText().equals("")){
            jogadas++;
            if(jogadas==1){
                comecarTemp(temp);
            }
            b3.setText(bApertado.getText());
            bApertado.setText("");
        }else if(b4.getText().equals("")){
            jogadas++;
            if(jogadas==1){
                comecarTemp(temp);
            }
            b4.setText(bApertado.getText());
            bApertado.setText("");
        }  
    }
    
    public boolean win(List vetor){
        List<String> vetor2 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "");
        
        return vetor.equals(vetor2);
           
    }

    public List embaralhar(List vetor){
        Collections.shuffle(vetor);
        return vetor;
    }

    public int getJogadas() {
        return jogadas;
    }

    public void setJogadas(int jogadas) {
        this.jogadas = jogadas;
    }
    
    public void temporizador(JLabel temp){
        s = 0;
        m = 0;
        h = 0;
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (s == 59) {
                    m++;
                    s = -1;
                    if (m == 60) {
                        h++;
                        m = 0;
                        if (h == 24) {
                            h = 0;
                        }
                    }
                }
                s++;
                if(h < 10 && m < 10 && s < 10){
                    temp.setText("Tempo: 0" + h + ":0" + m + ":0" + s);
                }else if(m < 10 && s < 10){
                    temp.setText("Tempo: " + h + ":0" + m + ":0" + s);
                }else if(h < 10 && s < 10){
                    temp.setText("Tempo: 0" + h + ":" + m + ":0" + s);
                }else if(h < 10 && m < 10){
                    temp.setText("Tempo: 0" + h + ":0" + m + ":" + s);
                }else if(h < 10){
                    temp.setText("Tempo: 0" + h + ":" + m + ":" + s);
                }else if(s < 10){
                    temp.setText("Tempo: " + h + ":" + m + ":0" + s);
                }else if(m < 10){
                    temp.setText("Tempo: " + h + ":0" + m + ":" + s);
                }else{
                    temp.setText("Tempo: " + h + ":" + m + ":" + s);
                }
            }
        });   
    }
    
    public void comecarTemp(JLabel temp){
        temporizador(temp);
        timer.start();
    }
    
    public void pararTemp(){
        timer.stop();
    }
   
}
