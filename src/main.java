import java.security.Security;

public class main {
	
	public static void main(String[] args) {
		
		
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
		ProduceKey produceKey = new ProduceKey();
		
		produceKey.generateKeyPair();
		
		System.out.println("����Ű : "+ produceKey.getPrivateKey());
		System.out.println("����Ű : "+ produceKey.getPublicKey());
		
		
		
	}

}
