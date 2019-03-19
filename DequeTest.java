import java.util.Scanner;
public class DequeTest {

	public static void main(String[] args) {
		Deque<String> deque=new Deque<String>();
		Scanner StdIn=new Scanner(System.in);
		String str;
		while(StdIn.hasNextLine())
		{
			//System.out.println("1:addFirst,2:addLast,3:removeFirst,4:removeLast,5:Display");
			str= StdIn.next();
			if(str.equals("1"))
			{
				str= StdIn.next();
				deque.addFirst(str);
			}
			else
				if(str.equals("2"))
				{
					str= StdIn.next();
					deque.addLast(str);
				}
				else
					if(str.equals("3"))
					{
						str=deque.removeFirst();
						System.out.println(str);
					}
					else
						if(str.equals("4"))
						{
							str=deque.removeLast();
							System.out.println(str);
						}
						else
							if(str.equals("5"))
							{
								for(String s:deque)
								{
									System.out.println(s);
								}
							}
		}
		StdIn.close();
	}
	
	

}
