/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    if(head==NULL){
        return false;
    }
    if(head->next==NULL){
        return false;
    }
    struct ListNode *p=head, *q=head;
    do{
        p=p->next;
        q=q->next;
        if(q){
            q=q->next;
        }
        else{
            q=NULL;
        }
    }while(p!=NULL && q!=NULL && p!=q);
    if(p==q){
        return true;
    }
    else{
        return false;
    }
    }
