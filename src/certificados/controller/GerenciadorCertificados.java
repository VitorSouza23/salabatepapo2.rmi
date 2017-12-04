/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificados.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import rmi.entities.Certificado;

/**
 *
 * @author aluno
 */
public class GerenciadorCertificados {
    public static Certificado getCertificado(String path) throws FileNotFoundException, CertificateException{
        Certificado certificado = null;
        FileInputStream fin = new FileInputStream(path);
        CertificateFactory f = CertificateFactory.getInstance("X.509");
        X509Certificate x509 = (X509Certificate)f.generateCertificate(fin);
        certificado = new Certificado(x509);
        return certificado;
    }
    
    public static List<Certificado> getAllCertificadosDeUmaPasta(String path) throws FileNotFoundException, CertificateException{
        List<Certificado> certificados = new ArrayList<>();
        File[] arquivos;
        File diretorio = new File(path);
        arquivos = diretorio.listFiles((File dir, String name) -> name.toLowerCase().endsWith(".crt"));
        for(int x = 0; x < arquivos.length; x++){
            FileInputStream fin  = new FileInputStream(arquivos[x]);
            CertificateFactory f = CertificateFactory.getInstance("X.509");
            X509Certificate x509 = (X509Certificate)f.generateCertificate(fin);
            Certificado certificado = new Certificado(x509);
            certificados.add(certificado);
        }
        return certificados;
    }
}
