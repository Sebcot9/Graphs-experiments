package Model;

import org.graphstream.algorithm.ConnectedComponents;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.DefaultGraph;

public class Test {
public static void main(String[] args) {
Graph graph = new DefaultGraph("CC Test");

graph.addNode("A");
graph.addNode("B");
graph.addNode("C");
graph.addNode("D");
graph.addNode("E");
graph.addEdge("AB", "A", "B");
graph.addEdge("AC", "A", "C");
graph.addEdge("AD", "A", "D");
graph.addEdge("EC", "E", "C");



ConnectedComponents cc = new ConnectedComponents();
cc.init(graph);

System.out.printf("%d connected component(s) in this graph, so far.%n",
cc.getConnectedComponentsCount());

graph.removeEdge("AC");

System.out.printf("Eventually, there are %d.%n", cc.getConnectedComponentsCount());
}
}