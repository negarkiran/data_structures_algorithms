package algorithms.dynamic_connectivity;

public class QuickFind {
    private int[] id;

    public QuickFind(int n) {
        this.id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    //Check if 2 objects are connected through a link
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    //Connect 2 objects
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) id[i] = qid;
        }
    }
}
