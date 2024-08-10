package Assignment2;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;
	boolean flag;
	int c;
	public boolean add(int e)
	{  root= adds(root,e);
		return flag;
	}
	public Node adds(Node n,int e)
	{
		if(n==null)
		{
			n=new Node(e);
			flag=true;
			c++;
			return n;
		}
		if(e>n.e)
		{
			n.right=adds(n.right,e);
		}
		else if(e<n.e)
		{
			n.left=adds(n.left,e);
		}
		else if(e==n.e)
		{
			flag=false;
		}
		return n;
		
	}
	public void level()
	{
	Queue<Node> q;
	q=new LinkedList<Node>();
	if(root!=null)q.add(root);
	while(!q.isEmpty())
	{
		Node n=q.poll();
		
		System.out.println(n.e+" ");
		if(n.left!=null)
	{
			q.add(n.left);
	}
		if(n.right!=null)q.add(n.right);
	}
	System.out.println();
		
	}
	public void leafN()
	{ leafN(root);
	}
	public void leafN(Node n)
	{   
		if(n.left!=null)leafN(n.left);
		 if(n.right!=null)leafN(n.right);
		if(n.left==null && n.right==null)
		{
			System.out.println(n.e);
		}
	}

}
