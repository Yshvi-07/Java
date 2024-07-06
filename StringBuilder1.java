{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
	//	String s=sc.nextLine();
/*	int n=sc.nextInt();
	int g=0;
		String name[]=new String[n];
		for(int i=0;i<n;i++){
		    name[i]=sc.nexT();
		    g+=name[i].length();
		    
		}
		
		System.out.println(g);
		
		
	//	System.out.println(s.length());*/
	int n=sc.nextInt();
	int g=0;
	StringBuilder s[]=new StringBuilder[n];
	for(int i=0;i<n;i++){
	    s[i]=new StringBuilder(sc.next());
	    g+=s[i].length();
	}
	System.out.println(g);	
		
	}
}
