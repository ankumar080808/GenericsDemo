package com.anant.GenericsSpringBoot;

//Generic class
public class GenericClassDemo<T,U> {
	
	private T content;
	
	private U sym;
	
	
	  public GenericClassDemo(T content,U sym) {
	  
	  this.content=content; this.sym=sym; }
	 
	public U getSym() {
		return sym;
	}

	public void setSym(U sym) {
		this.sym = sym;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
//	public static <T,U>  GenericClassDemo<T,U> createDemo(T t,U u)
//	{
//		return new GenericClassDemo <>(t,u);
//	}
//	

//	public static <X,V>  GenericClassDemo<X,V> createDemo(X x,V v)
//	{
//		return new GenericClassDemo <>(x,v);
//	}
	
	//Generic method
	public <B,C> B[] createArray(B [] b,C p)
	{
		for(B c: b)
		{
			System.out.println(c);
		}
		
		B [] d=b;
		return d;
	}
	

}
