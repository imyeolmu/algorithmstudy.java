package javastudy;

import java.util.Scanner;

public class algorithm0625 {
	public static void main(String[] args) {
		

	// �������� ,,, 5,10,15,20�� ��Ģ

//x�� �� �ڸ��� ���������� �̷��? �������� 110 �̸� 3�ڸ������ �Ѽ��� ���ü� ���� ������ 
	// 2�� �ڸ����� �Ѽ��� ����(1�� �ڸ�,2�� �ڸ��� �Ѽ��̴�): 99��°�
	// �Ѽ� : �� �ڸ������� ���������� �̷�� ��

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(), i, k, han = 0;

	int a[] = new int[3];
	
	for(i=1;i<=n;i++){ //�� �ڸ����� ���� �迭�� ũ��� 3�̸� 4�ڸ��� �̻��� ���� ������� ���Ѵ� ������ ���� ������ ó���ؾ���
		if (0 < i && i < 100)
			han = i;
		else if (i == 1000) // 4�ڸ����� �Ѽ��� �ƴϹǷ� �극��ũ���� ����� ���� �������Ѵ�
			break;
		else {
			k = 0;
			int t = i;
			// �ڸ��� �ɰ��� -> while ���� �迭 �̿� �ؼ� �迭�� �����ϵ��� �Ѵ�
			while (t > 0) {
				a[k] = t % 10; //k�� �迭�� �ε��� 0,1,2������ �����Ѵ� 
				t /= 10;//t�� i���� ���� �ӽú���  ����������´� 
				k++;  //�ݺ����� ������ �Ǹ� �߰��ڸ��� 2�� ���� ù���ڸ��� 1�� ���� �ȴ� -> �� �ڸ����� ������ �ǹ迭�Ͽ� ����
			}
			if (a[0] - a[1] == a[1] - a[2]) // ���ڸ����� �������� �Ѽ����� �ƴ��� �˾��Ѵ�
				han++;
		}
	}

}