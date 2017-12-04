/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.entities;

import java.io.Serializable;
import java.security.cert.X509Certificate;

/**
 *
 * @author aluno
 */
public class Certificado implements Serializable{
    private X509Certificate certificado;

    public Certificado() {
    }

    public Certificado(X509Certificate certificado) {
        this.certificado = certificado;
    }

    /**
     * @return the certificado
     */
    public X509Certificate getCertificado() {
        return certificado;
    }

    /**
     * @param certificado the certificado to set
     */
    public void setCertificado(X509Certificate certificado) {
        this.certificado = certificado;
    }
    
    
    
}
