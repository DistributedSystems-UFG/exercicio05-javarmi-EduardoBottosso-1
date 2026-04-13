package Calculator.java

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote{
	int multiplicacao(int a, int b) throws RemoteException;
	int divisao (int a, int b) throws RemoteException;
}
