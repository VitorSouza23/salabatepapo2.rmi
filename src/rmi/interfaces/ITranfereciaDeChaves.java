/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import rmi.entities.Certificado;

/**
 *
 * @author aluno
 */
public interface ITranfereciaDeChaves extends Remote{
    public byte[] getChaveSimetricaAtravesDeCertificado(Certificado certificado) throws RemoteException;
}
