
public class NicAsia implements Bank1,Bank2{

	@Override
	public String bankName() {
		return "nic asia";
	}

	@Override
	public float getRate() {
		return 12.45f;
	}

	float getinterestRate() {
		return 5.6f;
	}

}
