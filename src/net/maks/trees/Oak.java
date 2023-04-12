package net.maks.trees;

import net.maks.Tree;

public class Oak extends Tree {
    public boolean has_squirells = false;
    public int hole_count;
    public Oak(int hole_count) {
        super(true, 9);
        this.hole_count = hole_count;
        if (hole_count > 0) {
            this.has_squirells = true;
        }
    }
}
