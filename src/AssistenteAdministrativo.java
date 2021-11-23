
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rai_R
 */
public class AssistenteAdministrativo extends Funcionario {
    public AssistenteAdministrativo (){
        Random r = new Random ();
        salario = 500 + 1000 * r.nextFloat();
        categoria = 0;
    }
}
