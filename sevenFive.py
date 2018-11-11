def overlapping_lists(L1, L2):
	
    root1, root2 = has_cycle(L1), has_cycle(L2)

    if not root1 and not root2:
        return overlapping_no_cycle_lists(L1,L2)
    elif (root1 and not root2) or (not root1 and root2):
        return None
    
    temp = root2
    while True
        temp = temp.next
        if temp is root1 or temp is root2:
            break

    if temp is not root1
        return None
    
    def distance(a,b):
        dis = 0
        while a is not b
            a = a.next
            dis += 1
        return dis
    
    

        
    