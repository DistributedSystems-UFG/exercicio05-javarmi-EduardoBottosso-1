import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculatorImplem extends UnicastRemoteObject implements Calculator {

	public CalculatorImplem (int port) throws RemoteException {
		super (port);
}

	public int multiplicacao (int a, int b) throws RemoteException{
		return a*b;
}
	public int divisao (int a, int b) throws RemoteException{
		if (b ==0){
			throw new RemoteException ("Divisao por zero");
	}
		return a/b;
}

}
