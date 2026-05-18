# DSA Practice & Learning - Basic to Advanced

Complete Data Structures and Algorithms learning journey from basic concepts to LeetCode-level problems and beyond.

## About

This repository documents my comprehensive DSA learning path. It contains implementations, concepts explanations, and problem solutions—from fundamentals to advanced algorithms and data structures.

## Repository Structure

### 📚 Topics Covered

#### 1. **Recursion Fundamentals**
- Base case understanding
- Recursive thinking
- Power calculations using recursion
- **File:** `AraiseB.java`, `returning1.java`

#### 2. **Binary Search Trees (BST)**
- Tree node creation and traversal
- Min/Max finding in BST
- Searching in binary trees
- Counting nodes in range
- **Files:** `BST_Max_Min_Finder.java`, `search_BST.java`, `Count_BstNode_In_Range.java`

#### 3. **Tree Traversals**
- Pre-order traversal
- Post-order traversal
- In-order traversal
- Level tracking during traversal
- **Files:** `preOrder.java`, `postOrder.java`, `TreeNode.java`

#### 4. **Tree Properties**
- Height calculation
- Size/node counting
- Tree structure analysis
- **Files:** `Height.java`, `SizeOfTree.java`

## Learning Levels

### 🟢 Level 1: Fundamentals
- Understanding recursion
- Basic tree concepts
- Simple traversals

### 🟡 Level 2: Intermediate
- Complex tree operations
- Range queries
- Multi-traversal implementations

### 🔴 Level 3: Advanced
- Optimized solutions
- Edge case handling
- Real-world applications

### ⭐ Level 4: Expert
- LeetCode problems
- Interview-ready solutions
- Production-quality code

## Featured Programs

| File | Concept | Difficulty |
|------|---------|-----------|
| `AraiseB.java` | Recursive Power Calculation | 🟢 Easy |
| `returning1.java` | Recursive Countdown | 🟢 Easy |
| `preOrder.java` | Pre-order Tree Traversal | 🟡 Medium |
| `inOrder.java` | In-order Tree Traversal | 🟡 Medium |
| `postOrder.java` | Post-order Tree Traversal | 🟡 Medium |
| `Height.java` | Tree Height Calculation | 🟡 Medium |
| `SizeOfTree.java` | Count Tree Nodes | 🟡 Medium |
| `BST_Max_Min_Finder.java` | Find Min/Max in BST | 🟡 Medium |
| `search_BST.java` | Search in BST | 🟡 Medium |
| `TreeNode.java` | Multiple Traversals | 🟡 Medium |
| `Count_BstNode_In_Range.java` | Range Count in BST | 🔴 Hard |

## Getting Started

### Prerequisites
- Java 8 or higher
- Understanding of basic programming concepts

### Compilation & Running

```bash
# Compile
javac ProgramName.java

# Run
java ProgramName
```

**Example:**
```bash
javac Height.java
java Height
```

## Key Concepts Explained

### Recursion
A function that calls itself to solve a smaller version of the same problem.
```
Base Case: Stop condition
Recursive Case: Call function with modified input
```

### Tree Traversals
- **Pre-order:** Visit → Left → Right
- **In-order:** Left → Visit → Right
- **Post-order:** Left → Right → Visit

### Binary Search Tree (BST)
- Left child < Parent < Right child
- Enables efficient searching
- O(log n) average case

## Practice Tips

✅ **Understand before coding** - Know the algorithm first  
✅ **Trace through examples** - Follow code step-by-step  
✅ **Modify and experiment** - Change values and see results  
✅ **Compare solutions** - Different approaches for same problem  
✅ **Time complexity** - Understand O(n) analysis  

## What to Learn

### 1st Time Through
- Understand each program's purpose
- Trace the code manually
- Run and observe output

### 2nd Time Through
- Modify programs (change data structures, values)
- Write similar programs from scratch
- Solve variations

### 3rd Time Through
- Optimize solutions
- Combine multiple concepts
- Solve complex problems

## Roadmap for Growth

```
Basic Recursion → Trees → BST → Advanced Trees → Graphs → DP
```

## Next Steps

After mastering these concepts:
- [ ] AVL Trees and Self-balancing Trees
- [ ] Graph algorithms (DFS, BFS)
- [ ] Dynamic Programming
- [ ] LeetCode Medium/Hard problems
- [ ] Interview preparation

## Common Challenges & Solutions

**Q: Tree traversals seem similar?**  
A: Yes! The difference is *when* you visit the node:
- Pre-order: Visit first
- In-order: Visit in middle
- Post-order: Visit last

**Q: How to calculate tree height?**  
A: Height = 1 + max(leftHeight, rightHeight)

**Q: What's the BST advantage?**  
A: Searching is O(log n) instead of O(n)

## Resources Used

- Java documentation
- Data Structures & Algorithms textbooks
- Online coding platforms
- Problem-solving practice

## File Structure

```
dsa-practice-and-learning-basic/
├── AraiseB.java
├── returning1.java
├── preOrder.java
├── postOrder.java
├── TreeNode.java
├── Height.java
├── SizeOfTree.java
├── BST_Max_Min_Finder.java
├── search_BST.java
├── Count_BstNode_In_Range.java
└── README.md
```

## Progress Tracking

- [x] Recursion fundamentals
- [x] Tree basics
- [x] Traversals (Pre, In, Post)
- [x] Tree properties (Height, Size)
- [x] Binary Search Trees
- [x] BST operations
- [ ] Self-balancing trees
- [ ] Graph algorithms
- [ ] Dynamic programming

## License

Educational use - Feel free to learn and practice!

---

**Remember: DSA is about building a strong foundation for solving complex problems efficiently. Each program here is a stepping stone.** 

**Keep coding, keep learning, and celebrate your progress!** 
