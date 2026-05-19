# DSA Practice & Learning - Basic to Advanced

Complete Data Structures and Algorithms learning journey from basic concepts to LeetCode-level problems and beyond.

## About

This repository documents my comprehensive DSA learning path. It contains implementations, concepts explanations, and problem solutions—from fundamentals to advanced algorithms.

## 🎯 Repository Structure

```
dsa-practice-and-learning-basic/
├── basics/                    # Foundational concepts
│   ├── recursion/
│   ├── arrays/
│   ├── searching/
│   └── sorting/
├── intermediate/              # Core data structures
│   ├── trees/
│   ├── graphs/
│   ├── stacks-queues/
│   └── dynamic-programming/
├── leetcode/                  # Problem solutions
│   ├── easy/
│   ├── medium/
│   └── hard/
├── assignments/               # Course assignments
└── README.md
```

## 📚 Topics Covered

### 🟢 Level 1: Fundamentals
- **Recursion** — Base cases, recursive thinking, power calculations
- **Tree Basics** — Node structure, tree properties
- **Tree Traversals** — Pre-order, In-order, Post-order

### 🟡 Level 2: Intermediate  
- **Binary Search Trees (BST)** — Insertion, search, min/max
- **Tree Properties** — Height, size, depth
- **Complex Operations** — Range queries, balancing

### 🔴 Level 3: Advanced
- **Graph Algorithms** — DFS, BFS, shortest paths
- **Dynamic Programming** — Memoization, tabulation
- **Optimization Problems** — Greedy, divide-and-conquer

### ⭐ Level 4: LeetCode & Interviews
- Medium and hard problem solutions
- Edge case handling
- Production-quality optimized code

## 📋 Featured Programs

| File | Concept | Level |
|------|---------|-------|
| `AraiseB.java` | Recursive Power | 🟢 Easy |
| `returning1.java` | Recursive Countdown | 🟢 Easy |
| `preOrder.java` | Pre-order Traversal | 🟡 Medium |
| `inOrder.java` | In-order Traversal | 🟡 Medium |
| `postOrder.java` | Post-order Traversal | 🟡 Medium |
| `Height.java` | Tree Height | 🟡 Medium |
| `SizeOfTree.java` | Count Nodes | 🟡 Medium |
| `BST_Max_Min_Finder.java` | BST Min/Max | 🟡 Medium |
| `search_BST.java` | BST Search | 🟡 Medium |
| `Count_BstNode_In_Range.java` | Range Count | 🔴 Hard |

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher (Java 21+ recommended)
- IDE: IntelliJ IDEA, VS Code, or Eclipse

### Quick Start

```bash
# Compile a program
javac ProgramName.java

# Run it
java ProgramName

# Example
javac Height.java
java Height
```

### Using IDE
1. Open folder as project
2. Navigate to any `.java` file
3. Right-click → Run or press Ctrl+Shift+F10 (IntelliJ)

## 📖 Key Concepts

### Recursion
```
Function calls itself to solve smaller version of problem
├── Base Case: Stopping condition
└── Recursive Case: Call with modified input
```

### Tree Traversals
- **Pre-order:** Node → Left → Right
- **In-order:** Left → Node → Right  
- **Post-order:** Left → Right → Node

### Binary Search Tree (BST)
```
Property: Left < Parent < Right
Benefit: O(log n) average search time
Structure: Maintains sorted order
```

## 💡 How to Use This Repo

### 1️⃣ First Pass
- Read the algorithm explanation
- Trace through code manually
- Understand the logic flow
- Run the program

### 2️⃣ Second Pass
- Modify values and observe changes
- Write similar programs from scratch
- Solve related variations
- Test edge cases

### 3️⃣ Third Pass
- Optimize for speed/memory
- Combine multiple concepts
- Solve complex problems
- Prepare for interviews

## 🗺️ Learning Path

```
Recursion → Trees → BST → Graphs → Dynamic Programming → Advanced Algorithms
```

## ✅ Progress Checklist

- [x] Recursion fundamentals
- [x] Tree basics & traversals
- [x] Tree properties (height, size)
- [x] Binary Search Trees
- [x] BST operations & range queries
- [ ] Self-balancing trees (AVL, Red-Black)
- [ ] Graph algorithms (DFS, BFS, Dijkstra)
- [ ] Dynamic Programming patterns
- [ ] LeetCode Medium problems
- [ ] LeetCode Hard problems

## 🎓 Interview Prep

For interview preparation, focus on:
- Tree & BST operations
- Graph traversal & shortest paths
- Dynamic programming patterns
- Time & space complexity analysis
- Edge case handling

**Target:** LeetCode Medium & Hard problems

## 🛠️ Development Notes

- **Code Style:** Clear variable names, well-commented
- **Time Complexity:** Noted in code comments
- **Space Complexity:** Optimizations documented
- **Test Cases:** Example runs included

## 📚 Resources & References

- [GeeksforGeeks DSA](https://www.geeksforgeeks.org/data-structures/)
- [LeetCode Problems](https://leetcode.com/)
- [Abdul Bari DSA Tutorial](https://www.youtube.com/playlist?list=PLDN4rrl48XKpZkP4oJjT5TPgPCAhYL94nJ)
- [Java Documentation](https://docs.oracle.com/javase/)

## 🤝 Contributing

Feel free to:
- ✅ Add new solutions
- ✅ Optimize existing code
- ✅ Add detailed explanations
- ✅ Include more test cases
- ✅ Fix bugs or improve clarity

## ⏱️ Compilation Tips

### Remove Compiled Files
```bash
find . -name "*.class" -delete
```

### Clean Build
```bash
rm -rf out/
# Then recompile as needed
```

## 📝 License

Educational use - Free to learn, practice, and improve!

---

**Last Updated:** May 2026  
**Status:** 🟢 Active - Regularly adding problems and optimizations
