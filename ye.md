---

## **1. `plot()`**  
**Package**: `graphics`

### **🔹 Purpose**  
Creates a **scatterplot**, **line plot**, or other types of base graphics plots depending on the type of input data. It is a generic function with methods for different data types (e.g., numeric, factor, formula).

---

### **🔹 Function Header**
```r
plot(x, y = NULL, type = "p", main = NULL, sub = NULL, xlab = NULL, ylab = NULL,
     asp = NA, xlim = NULL, ylim = NULL, log = "", ...)
```

| **Parameter** | **Description** | **Accepted Values / Type** |
|---------------|------------------|-----------------------------|
| `x` | The coordinates or object to be plotted. | Numeric vector, formula, or object. |
| `y` | Optional y-coordinates. | Numeric vector or `NULL`. |
| `type` | Type of plot. | `"p"` (points), `"l"` (lines), `"b"` (both), `"c"` (lines without points), `"o"` (overplotted), `"h"` (histogram-like vertical lines), `"s"` (stair steps), `"S"` (other stair steps), `"n"` (no plotting). |
| `main` | Main title of the plot. | Character string |
| `sub` | Subtitle of the plot. | Character string |
| `xlab`, `ylab` | Axis labels. | Character string |
| `asp` | Aspect ratio. | `NA` (default), or numeric |
| `xlim`, `ylim` | Axis limits. | Numeric vector of length 2 |
| `log` | Axis scaling (logarithmic). | `""`, `"x"`, `"y"`, `"xy"` |
| `...` | Additional graphical parameters. | See graphical parameters below |

---

### **🔹 Graphical Parameters (Selected)**  
Can be passed via `...`

| **Parameter** | **Purpose** | **Accepted Values** |
|---------------|------------|---------------------|
| `col` | Color of plot elements. | Color names, hex codes, or numeric (e.g., `"red"`, `"#FF0000"`, `1`) |
| `pch` | Plotting symbol. | Integer or character (e.g., `1`–`25`, `"+"`, `"x"`) |
| `lty` | Line type. | `"solid"`, `"dashed"`, `"dotted"`, `"dotdash"`, `"longdash"`, `"twodash"`, or integers `0`–`6` |
| `lwd` | Line width. | Numeric |
| `cex` | Character expansion for symbols/text. | Numeric |
| `bg` | Background color for symbols with fill. | Color |
| `xaxs`, `yaxs` | Axis interval type. | `"r"` (regular), `"i"` (internal) |
| `xaxt`, `yaxt` | Axis drawing control. | `"s"` (standard), `"n"` (none) |
| `frame.plot` | Draw box around plot. | `TRUE`, `FALSE` |

---

### **🔹 Example Use Cases**
```r
# Simple scatter plot
plot(1:10, rnorm(10))

# Line plot with titles
plot(1:10, sin(1:10), type = "l", main = "Sine Wave", xlab = "Index", ylab = "Value")

# Custom symbols and colors
plot(1:5, 1:5, pch = 19, col = "blue", cex = 2)
```

---

## **2. `unique()`**  
**Package**: `base`

### **🔹 Purpose**  
Returns a vector, data frame, or array **with duplicate elements/rows removed**, keeping the first occurrence.

---

### **🔹 Function Header**
```r
unique(x, incomparables = FALSE, ...)
```

| **Parameter** | **Description** | **Accepted Values / Type** |
|---------------|------------------|-----------------------------|
| `x` | Object to process. | Vector, data frame, array, factor |
| `incomparables` | Values that cannot be compared. | Logical or vector (usually `FALSE`) |
| `...` | Additional arguments passed to methods. | Varies (e.g., used in method for data frames) |

---

### **🔹 Example Use Cases**
```r
# Vector
unique(c(1, 2, 2, 3, 1))
# Output: 1 2 3

# Character vector
unique(c("apple", "banana", "apple"))
# Output: "apple" "banana"

# Data frame
df <- data.frame(name = c("A", "B", "A"), value = c(1, 2, 1))
unique(df)
# Output: Returns only unique rows
```

---
