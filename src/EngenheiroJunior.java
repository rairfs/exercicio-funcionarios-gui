
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rai_R
 */
public class EngenheiroJunior extends Funcionario {
    public EngenheiroJunior(){
        Random r = new Random();
        salario = 1000 + 1500 * r.nextFloat();
        strCategoria = "Engenheiro Junior";
        categoria = 1;
    }
    
}
