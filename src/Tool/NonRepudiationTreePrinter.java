package Tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonRepudiationTreePrinter {
	static String ch1="";
	/**
	 * Create the panel.
	 */
	public static <T extends Comparable<?>> void printNode(Node<T> root) {
        int maxLevel = NonRepudiationTreePrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <T extends Comparable<?>> void printNodeInternal(List<Node<T>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || NonRepudiationTreePrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        NonRepudiationTreePrinter.printWhitespaces(firstSpaces);
        ch1=ch1+" ";

        List<Node<T>> newNodes = new ArrayList<Node<T>>();
        for (Node<T> node : nodes) {
            if (node != null) {
                System.out.print(node.data);
               ch1=ch1+""+node.data.toString();
                
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
                ch1=ch1+"";
            }

            NonRepudiationTreePrinter.printWhitespaces(betweenSpaces);
           //ch1=printWhitespaces(betweenSpaces);
           ch1=ch1+" ";
        }
        System.out.println("");
        ch1=ch1+"\n";

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
            	NonRepudiationTreePrinter.printWhitespaces(firstSpaces - i);
                ch1=ch1+" ";
                if (nodes.get(j) == null) {
                	NonRepudiationTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    ch1=ch1+" ";
                    continue;
                }

                if (nodes.get(j).left != null)
                {  System.out.print("/");
                   ch1=ch1+"/";
                }
                
                else
                { NonRepudiationTreePrinter.printWhitespaces(1);
                ch1=ch1+" ";
                }

                NonRepudiationTreePrinter.printWhitespaces(i + i - 1);
               
                ch1=ch1+" ";

                if (nodes.get(j).right != null)
                { System.out.print("\\");
                ch1=ch1+"\\";
                }
                else
                {  NonRepudiationTreePrinter.printWhitespaces(1);
                ch1=ch1+" ";
                }

                NonRepudiationTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
                ch1=ch1+" ";
            }

            System.out.println("");
            ch1=ch1+"\n";
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
        ch1=ch1+" ";
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
        ch1=ch1+" ";
    }

    private static <T extends Comparable<?>> int maxLevel(Node<T> node) {
        if (node == null)
            return 0;

        return Math.max(NonRepudiationTreePrinter.maxLevel(node.left), NonRepudiationTreePrinter.maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }
    public static String ret()
    { return ch1; }
}
