import java.security.Security;

public class main {
	
	public static void main(String[] args) {
		
		
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
		ProduceKey produceKey = new ProduceKey();
		
		produceKey.generateKeyPair();
		
		System.out.println("개인키 : "+ produceKey.getPrivateKey());
		System.out.println("공개키 : "+ produceKey.getPublicKey());
		
		
		
	}

}
