package com.fp;

import java.util.List;


public class FP{
	
	
	private static Building
	
//	private static class Building{
//		public void paint() {
//			System.out.println("paint");
//		}
//	}
	
	public static void paintAllBuildings(List<Building> buildings) {
		
		
		buildings.forEach(Building::paint);
		
	}
}
