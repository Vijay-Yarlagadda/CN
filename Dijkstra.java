// Aim: Write a simple program to implement Dijkstra's algorithm to find the shortest path in a graph.

import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get number of vertices
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        // Step 2: Get adjacency matrix
        int[][] cost = new int[n][n];
        System.out.println("Enter cost matrix (0 if no direct edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
                if (cost[i][j] == 0 && i != j)
                    cost[i][j] = 999; // 999 means no direct connection
            }
        }

        // Step 3: Get source vertex
        System.out.print("Enter source vertex (0 to " + (n - 1) + "): ");
        int src = sc.nextInt();

        int[] dist = new int[n]; // shortest distance from source
        int[] visited = new int[n]; // 1 if visited, 0 if not

        // Step 4: Initialize distances
        for (int i = 0; i < n; i++)
            dist[i] = cost[src][i];

        visited[src] = 1;
        dist[src] = 0;

        // Step 5: Dijkstra’s main logic
        for (int count = 1; count < n - 1; count++) {
            int min = 999, u = -1;

            // Find the nearest unvisited vertex
            for (int i = 0; i < n; i++) {
                if (visited[i] == 0 && dist[i] < min) {
                    min = dist[i];
                    u = i;
                }
            }

            visited[u] = 1;

            // Update distances
            for (int v = 0; v < n; v++) {
                if (visited[v] == 0 && dist[u] + cost[u][v] < dist[v]) {
                    dist[v] = dist[u] + cost[u][v];
                }
            }
        }

        // Step 6: Print shortest distances
        System.out.println("\nShortest distance from source " + src + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("To vertex " + i + " = " + dist[i]);
        }

        sc.close();
    }
}
