#include<stdio.h>
void swap(int n1,int n2)
{
	int t=n1;
	n1=n2;
	n2=t;
}
int main()
{
	int x=20;
	int y=68;
	printf("\n before swap %d%d",x,y);
	swap(x,y);
	printf("\n afer swap %d%d",x,y);
	return 0;
}