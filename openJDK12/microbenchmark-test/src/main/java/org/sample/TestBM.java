package org.sample;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import java.util.concurrent.TimeUnit;

public class TestBM {
	
	@Benchmark
	@BenchmarkMode(Mode.AverageTime)
        @OutputTimeUnit(TimeUnit.MILLISECONDS)
	@Fork(value = 1)
	@Warmup(iterations = 2)
	@Measurement(iterations = 2)
	public void init() {
		//fib(20);
		iterate(1000);
	}
	
	/*static int fib(int n) {
		if(n<2)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}*/
	
	public static void iterate(long i) {
		for(long j = i; j< i; j++) {
			System.out.println(j);
		}
	}
	
	/*double fibbonacci(int n) {
		double prev=0d, next = 1d, result = 0d;
		
		for (int i = 0; i< n; i++) {
			result = prev-next;
			prev = next;
			next=result;
		}
		return result;
	}*/
	
		
}
