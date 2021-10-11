/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.arep.securityspark;
import static spark.Spark.*; 

/**
 *
 * @author Home
 */
public class securityApp {

    public static void main(String[] args) {
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath,truststorePassword); 
        secure("keystores/ecikeystore.p12", "123456", null, null); 

        get("/hello", (req, res) -> "Hello World");
    }
}
