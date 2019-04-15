
public class ArrayHeap <T extends Comparable <T>>{
	private T[]heap;
	public static final int DEF_SIZE = 120;
	private int lastIndex;
	public ArrayHeap() {
		
	}
	public ArrayHeap(int s) {
		
	}
	private void init (int s) {
		if(s<=0) {
			return;
		}
		heap = (T[])(new Comparable[s]);
		lastIndex = 0;
	}
	public void insert(T aData) {
		if(lastIndex>= heap.length)
			return;
		heap[lastIndex] = aData;
		bubbleUp();
		lastIndex++;
	}
	private void bubbleUp() {
		int index = lastIndex;
		while(index > 0 &&
				heap[(index-1)/2].compareTo(heap[index])<0) {
			//Swap
			T temp = heap [(index -1)/2] = heap[index];
			heap[index] = temp;
			index = (index-1)/2;
		}
	}
	public T peek() {
		return heap[0];
			
	}
	public void print() {
		
		for(T temp: heap)
			System.out.println(temp);	
	}
	public T delete(){
		T retVal = heap [0];//Return the root value
		heap[0] = heap[lastIndex -1];
		heap[lastIndex -1] = null;
		 lastIndex --;
		 bubbleDown();
		 return retVal;
	}
	private void bubbleDown() {
		int index = 0;
		while(index*2 +1 < lastIndex) {//While there is a left child
			//Assume the left is larger
			int bigIndex = index*2 +1;
			//Confirm that it is
			if(index*2+2 <lastIndex &&
					heap[index*2+1].compareTo(heap[index*2+2])<0)
				bigIndex = index *2 +2;
			if(heap[index].compareTo(heap[bigIndex])<0) {
				//Swap
				T temp = heap[index];
				heap[index] = heap[bigIndex];
				heap[bigIndex] = temp;
			}else
				break; //Parent was larger
			index = bigIndex;
		}
	}
	public void heapSort() {
		for(int i  = 0;i <lastIndex;i++) {
			System.out.println(this.delete());
		}
	}
}










































