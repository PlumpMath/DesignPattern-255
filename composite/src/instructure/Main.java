package instructure;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Composite root = new Composite("Root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.Add(new Leaf("Leaf XA"));
        comp.Add(new Leaf("Leaf XB"));
        root.Add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.Add(new Leaf("Leaf XYA"));
        comp2.Add(new Leaf("Leaf XYB"));
        root.Add(comp2);

        root.Add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.Add(leaf);
        root.Remove(leaf);

        root.Display(1);
    }
}
