package com.bridelabz.node;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListJunit {

	@Test
    public void search() {
		LinkedListSearch list = new LinkedListSearch();
        list.searchNode(56);
        Assert.assertEquals(list, list);
    }
}
