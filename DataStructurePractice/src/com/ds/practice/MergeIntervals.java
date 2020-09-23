package com.ds.practice;

import java.util.ArrayList;

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return start + " " + end;
	}
}

public class MergeIntervals {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int j = 0;
		if (intervals.size() == 0) {
			intervals.add(newInterval);
			return intervals;
		}
		int i = 0;
		while (i < intervals.size()) {

			Interval curr = intervals.get(i);

			if (newInterval.start > curr.end) {
				i++;
			} else if (newInterval.end < curr.start) {
				intervals.add(i, newInterval);
				break;
			} else {
				newInterval.start = Math.min(curr.start, newInterval.start);
				newInterval.end = Math.max(curr.end, newInterval.end);

				intervals.remove(i);

			}

		}
		if (i == intervals.size()) {
			intervals.add(i, newInterval);
		}

		return intervals;

	}

	public static void main(String[] args) {
		MergeIntervals interval12 = new MergeIntervals();
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		Interval I1 = new Interval(1, 2);
		Interval I2 = new Interval(3, 5);
		Interval I3 = new Interval(6, 7);
		Interval I4 = new Interval(8, 10);
		Interval I5 = new Interval(12, 16);

		intervals.add(I1);
		intervals.add(I2);
		intervals.add(I3);
		intervals.add(I4);
		intervals.add(I5);

		Interval newInterval = new Interval(4, 9);
		ArrayList<Interval> res = interval12.insert(intervals, newInterval);
		System.out.println(res);
	}
}
