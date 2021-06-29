import java.io.*;
class Calculations
{		
	float Feet=30.48f;
	float Inch=2.54f;
	float a,c,d,hcm,b,ibw,w,ovorun,intensity,protein,carbs,fat,ans,bfat,ratio,lbmper,lbmkg,creprotein;
	String g,n,crea;
	
	
	public void DataAccept() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter Height (Feet):");
		a=Float.parseFloat(br.readLine());
		System.out.println("\nEnter Height (Inches):");
		b=Float.parseFloat(br.readLine());
		System.out.println("\nEnter Weight:");
		w=Float.parseFloat(br.readLine());
		System.out.println("\nEnter Gender:\n'M' for Male\n'F' for Female");
		g=br.readLine();
		c= a*Feet;
		d=b*Inch;
		hcm= c+d;
	}
	public void IntensityCal()throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Workout Intensity: \n'S' for Sedentry\n'B' for Beginner\n'I' for Intermediate\n'A' for Advanced\n'SA' for Super Advanced\n Please Choose Right Option.");
		n=br.readLine();
		if(n.equals("S")&& g.equals("F"))
		{
			intensity=0.8f;
		}
		else if(n.equals("B")&& g.equals("F"))
		{
			intensity=1f;
		}
		else if(n.equals("I")&& g.equals("F"))
		{
			intensity=1.5f;
		}
		else if(n.equals("A")&& g.equals("F"))
		{
			intensity=2f;
		}
		else if(n.equals("SA")&& g.equals("F"))
		{
			intensity=2.5f;
		}
		else if(n.equals("S")&& g.equals("M"))
		{
			intensity=1f;
		}
		else if(n.equals("B")&& g.equals("M"))
		{
			intensity=1.5f;
		}
		else if(n.equals("I")&& g.equals("M"))
		{
			intensity=2f;
		}
		else if(n.equals("A")&& g.equals("M"))
		{
			intensity=2.5f;
		}
		else if(n.equals("SA")&& g.equals("M"))
		{
			intensity=3f;
		}
		else
		{
			System.out.println("Please Enter Right Choice..");
		}
	}
	public void LBMCalMale()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		if (g.equals("M"))
		{
			ibw=hcm-100;
			System.out.println("\nIdeal Body Weight:"+ibw);
			ovorun=w-ibw;
			if(w>ibw)
			{
				System.out.println("Overweight By:"+ovorun+" KG");
				bfat=ovorun+15;
				System.out.println("Body Fat:"+bfat+"%");
				lbmper=100-bfat;
				System.out.println("LBM Percentage:"+lbmper+" %");
				lbmkg=(lbmper/100)*w;
				System.out.println("LBM in KG:"+lbmkg+" KG");
				protein=lbmkg*intensity;
				System.out.println("Are You Supplementing Creatine?:\n'Y' or 'N'?");
				crea=br.readLine();

				if(crea.equals("Y"))
				{
					protein=lbmkg*intensity;
					creprotein=protein+(protein*0.3f);
					
					System.out.println("Protein Requirement:"+creprotein);
					System.out.println("Protein Requirement for Each Meal:"+creprotein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						carbs=creprotein*1;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						carbs=creprotein*2;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						carbs=creprotein*3;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						carbs=creprotein*4;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
				}
				else if(crea.equals("N"))
				{
					System.out.println("Protein Requirement:"+protein);
					System.out.println("Protein Requirement for Each Meal:"+protein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						carbs=protein*1;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						carbs=protein*2;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						carbs=protein*3;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						carbs=protein*4;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
				}

			}
			
			if(w<ibw && ovorun<-10)
			{
				System.out.println("Super Ectomorph");
				protein=w*intensity;
				System.out.println("Are You Supplementing Creatine?:\n'Y' or 'N'?");
				crea=br.readLine();
				if(crea.equals("Y"))
				{
					protein=w*intensity;
					creprotein=protein+(protein*0.3f);
					System.out.println("Protein Requirement:"+creprotein);
					System.out.println("Protein Requirement for Each Meal:"+creprotein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						carbs=creprotein*1;
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						carbs=creprotein*2;
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						carbs=creprotein*3;
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						carbs=creprotein*4;
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
					
				}
				else if(crea.equals("N"))
				{
					System.out.println("Protein Requirement:"+protein);
					System.out.println("Protein Requirement for Each Meal:"+protein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						carbs=protein*1;
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						carbs=protein*2;
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						carbs=protein*3;
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						carbs=protein*4;
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
				}
			} 
			else if(w<ibw)
			{
				System.out.println("Underweight By:"+ovorun*(-1)+" KG");
				bfat=ovorun*(-1)+15;
				System.out.println("Body Fat:"+bfat+"%");
				lbmper=100-bfat;
				System.out.println("LBM Percentage:"+lbmper+" %");
				lbmkg=(lbmper/100)*w;
				System.out.println("LBM in KG:"+lbmkg+" KG");
				protein=lbmkg*intensity;
				System.out.println("Are You Supplementing Creatine?:\n'Y' or 'N'?");
				crea=br.readLine();
				if(crea.equals("Y"))
				{
					protein=lbmkg*intensity;
					creprotein=protein+(protein*0.3f);
					System.out.println("Protein Requirement:"+creprotein);
					System.out.println("Protein Requirement for Each Meal:"+creprotein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						carbs=creprotein*1;
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						carbs=creprotein*2;
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						carbs=creprotein*3;
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						carbs=creprotein*4;
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
				}
				else if(crea.equals("N"))
				{
					System.out.println("Protein Requirement:"+protein);
					System.out.println("Protein Requirement for Each Meal:"+protein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						carbs=protein*1;
						ans=(creprotein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						carbs=protein*2;
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						carbs=protein*3;
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						carbs=protein*4;
						ans=(protein*4)+(carbs*4)*0.35f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
				}
			}
		}
	}
	public void LBMCalFemale()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		if (g.equals("F"))
		{
			ibw=hcm-105;
			System.out.println("\nIdeal Body Weight:"+ibw);
			ovorun=w-ibw;
			if(w>ibw)
			{
				System.out.println("Overweight By:"+ovorun+" KG");
				bfat=ovorun+20;
				System.out.println("Body Fat:"+bfat+"%");
				lbmper=105-bfat;
				System.out.println("LBM Percentage:"+lbmper+" %");
				lbmkg=(lbmper/100)*w;
				System.out.println("LBM in KG:"+lbmkg+" KG");
				protein=lbmkg*intensity;
				System.out.println("Are You Supplementing Creatine?:\n'Y' or 'N'?");
				crea=br.readLine();
				if(crea.equals("Y"))
				{
					protein=lbmkg*intensity;
					creprotein=protein+(protein*0.3f);
					
					System.out.println("Protein Requirement:"+creprotein);
					System.out.println("Protein Requirement for Each Meal:"+creprotein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						carbs=creprotein*1;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						carbs=creprotein*2;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						carbs=creprotein*3;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						carbs=creprotein*4;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
				}
				else if(crea.equals("N"))
				{
					System.out.println("Protein Requirement:"+protein);
					System.out.println("Protein Requirement for Each Meal:"+protein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						carbs=protein*1;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						carbs=protein*2;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						carbs=protein*3;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						carbs=protein*4;
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
				}
			}
			
			if(w<ibw && ovorun<-10)
			{
				System.out.println("Super Ectomorph");
				protein=w*intensity;
				System.out.println("Are You Supplementing Creatine?:\n'Y' or 'N'?");
				crea=br.readLine();
				if(crea.equals("Y"))
				{
					protein=w*intensity;
					creprotein=protein+(protein*0.3f);
					System.out.println("Protein Requirement:"+creprotein);
					System.out.println("Protein Requirement for Each Meal:"+creprotein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						carbs=creprotein*1;
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						carbs=creprotein*2;
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						carbs=creprotein*3;
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						carbs=creprotein*4;
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
					
				}
				else if(crea.equals("N"))
				{
					System.out.println("Protein Requirement:"+protein);
					System.out.println("Protein Requirement for Each Meal:"+protein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						carbs=protein*1;
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						carbs=protein*2;
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						carbs=protein*3;
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						carbs=protein*4;
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);				
						System.out.println("Fat Requirement:"+fat);
					}
				}


			} 
			else if(w<ibw)
			{
				System.out.println("Underweight By:"+ovorun*(-1)+" KG");
				bfat=ovorun*(-1)+20;
				System.out.println("Body Fat:"+bfat+"%");
				lbmper=105-bfat;
				System.out.println("LBM Percentage:"+lbmper+" %");
				lbmkg=(lbmper/100)*w;
				System.out.println("LBM in KG:"+lbmkg+" KG");
				protein=lbmkg*intensity;
				System.out.println("Are You Supplementing Creatine?:\n'Y' or 'N'?");
				crea=br.readLine();
				if(crea.equals("Y"))
				{
					protein=lbmkg*intensity;
					creprotein=protein+(protein*0.3f);
					System.out.println("Protein Requirement:"+creprotein);
					System.out.println("Protein Requirement for Each Meal:"+creprotein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						carbs=creprotein*1;
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						carbs=creprotein*2;
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						carbs=creprotein*3;
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						carbs=creprotein*4;
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
				}
				else if(crea.equals("N"))
				{
					System.out.println("Protein Requirement:"+protein);
					System.out.println("Protein Requirement for Each Meal:"+protein/6);
					System.out.println("Enter Carbs Ratio:\n1 or 2 or 3 or 4?");
					ratio=Float.parseFloat(br.readLine());
					if(ratio==1)
					{
						carbs=protein*1;
						ans=(creprotein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==2)
					{
						carbs=protein*2;
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==3)
					{
						carbs=protein*3;
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
					else if(ratio==4)
					{
						carbs=protein*4;
						ans=(protein*4)+(carbs*4)*0.45f;
						fat=(ans/9);
						System.out.println("Carbs:"+carbs);
						System.out.println("Carbs Requirement for Each Meal:"+carbs/6);
						System.out.println("Fat Requirement:"+fat);
					}
				}
			}
		}
	}
	public void Display()
	{
		System.out.println("Height in CM:"+hcm);
	}	
}
class Main
{
	public static void main(String args[]) throws IOException
	{
		Calculations c=new Calculations();
		c.DataAccept();
		c.IntensityCal();
		c.LBMCalMale();
		c.LBMCalFemale();
	}
}
