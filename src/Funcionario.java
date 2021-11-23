/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rai_R
 */
public abstract class Funcionario implements Comparable<Funcionario> {
    protected float salario;
    protected int categoria;
    protected String strCategoria;
    
    @Override
    public String toString(){
        return String.format("(%s,%10.2f)", strCategoria, salario);
    }
            
    @Override
    public int compareTo(Funcionario f) {
        if (categoria > f.categoria){
            return 1;
        }
        else if (categoria == f.categoria){
            if (salario > f.salario){
                return 1;
            }
            else if (salario == f.salario){
                return 0;
            }
            else {
                return -1;
            }
        }
        else {
            return -1;
        }
    }

}
