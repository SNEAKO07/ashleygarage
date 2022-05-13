#include<stdlib.h>
#include<stdio.h>
    struct node
    {
        int data;
        struct node *next;

    };
    struct node *front;
    struct node *rear;
    void insert();
    void delete();
    void display();
    void main()
    {
        printf("\n                              MAIN MENU           \n");
        int choice;
        while(choice!=4)
        {
            printf("\n1.Insert an element \n2.Delete an element \n3.Display the queue \n4.Exit\n" );
            printf("/n Enter your choice ");
            scanf("%d",&choice);
            switch(choice)
            {
                case 1:
                insert();
                break;
                case 2:
                delete();
                break;
                case 3:
                display();
                break;
                case 4:
                exit(0);
                break;
                default:
                printf("\nEnter valid choice.");
            }
        }
    }
    void insert()
    {
        struct node *ptr;
        int val;
        ptr=(struct node*)malloc(sizeof(struct node));
        if(ptr==NULL)
        {
            printf("\nOVERFLOW\n");
            return;
        }
        else
        {
            printf("\nEnter value:");
            scanf("%d",&val);
            ptr->data=val;
            if(front=NULL)
            {
                front=ptr;
                rear=ptr;
                front->next=NULL;
                rear->next=NULL;
            }
            else
            {
                rear->next=ptr;
                rear=ptr;
                rear->next=NULL;
            }

        }

    }
    void delete()
    {
        struct node *ptr;
        if(front==NULL)
        {
        printf("\nUNDERFLOW\n");
        return;
        }
        else
        {
            ptr=front;
            front=front->next;
            free(ptr);
            printf("\Deleted");

        }
    }
    void display()
    {
        struct node *ptr;
        ptr=front;
        if(front==NULL)
        {
            printf("\nEmpty queue\n");
        }
        else
        {
        printf("\nprinting values  \n");
            while(ptr!=NULL)
            {
            printf("\n%d\n",ptr->data);
            ptr->next;
            }
        }
    }





















