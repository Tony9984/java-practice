package practice;

import java.util.*;
import java.io.*;

public class tree_height {
	class FastScanner {
		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}

	class Node {
		int data;
		List<Node> children = new ArrayList<Node>();

		public Node(int data) {
			this.data = data;
		}

		public void addChild(Node child) {
			this.children.add(child);
		}

		public List<Node> getChildren() {
			return this.children;
		}
	}

	public class TreeHeight {
		int n;
		int parent[];

		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = in.nextInt();
			}
		}
		
		int getHeight(Node root) {
			if (root == null)
				return 0;
			int height = 0;
			for (Node node : root.getChildren()) {
				height = Math.max(height, getHeight(node));
			}
			return height + 1;
		}

		int computeHeight() {
			Node[] nodes = new Node[n];
			Node root = null;
			for (int i = 0; i < n; i++) {
				nodes[i] = new Node(i);
			}
			for (int i = 0; i < parent.length; i++) {
				int parentIndex = parent[i];
				if (parentIndex == -1)
					root = nodes[i];
				else
					nodes[parentIndex].addChild(nodes[i]);
			}
			return getHeight(root);
		}
	}

	static public void main(String[] args) throws IOException {
		new Thread(null, new Runnable() {
			public void run() {
				try {
					new tree_height().run();
				} catch (IOException e) {
				}
			}
		}, "1", 1 << 26).start();
	}

	public void run() throws IOException {
		TreeHeight tree = new TreeHeight();
		tree.read();
		System.out.println(tree.computeHeight());
	}
}
