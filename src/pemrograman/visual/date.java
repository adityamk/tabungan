/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman.visual;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Aditya Maulana
 */
public class date {
    public static String getTanggal(){
        DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateformat.format(date);
    }
    public static void main(String [] args){
        System.out.println(date.getTanggal());
    }
}
