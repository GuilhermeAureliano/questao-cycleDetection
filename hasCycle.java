static boolean hasCycle(SinglyLinkedListNode head) {
        Set<SinglyLinkedListNode> visitados = new HashSet<>();
        
        while (head != null) {
            if (visitados.contains(head)) {
                return true;
            }
            visitados.add(head);
            head = head.next;
        }
        return false;
    }
