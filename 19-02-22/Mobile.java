class Mobile

	{
	String Mobilemodel;
	String MobileCompany;
	Double MobilePrice;

	public void AddMobile(String Mmodel, String Mcompany, double Mprice)

{
	Mobilemodel=Mmodel;
	MobileCompany=Mcompany;
	MobilePrice=Mprice;
	
}

	public void Mdisplay()
	{
		System.out.println(MobileModel+ " " +MobileCompany+ " price is " +MobilePrice);
	}
}
