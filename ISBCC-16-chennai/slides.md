---
authors:
- |
    Saurabh Mathur\
    *saurabhmathur96@gmail.com*
title: Decision making using fuzzy soft set inference system
...

### Abstract

A 5000 feet view

-   An overview of currently available soft set algorithms for decision
    making.

-   Using existing tools in fuzzy set theory to solve problems expressed
    in terms of soft sets.

-   Allowing multiple choices to be made by comparative analysis.

-   conversion of fuzzy parameterized fuzzy soft sets to fuzzy
    parameterized soft sets

### Methodology

-   Simulations on Python 2.7 using NumPy.

-   IPython/Jupyter Notebooks.

-   Math :)

### Introduction

Soft Sets

-   Proposed by Molodtsov in 1999

-   A generalization of fuzzy set theory which was given by Zadeh.

-   Aims to solve complicated economic, environmental, and social
    problems.

### Soft Sets

Definition

The *soft set* is a parametrized family of subsets of the set $U$.\
Every set $F(e)$, $e \in E$, from this family may be considered as the
set of e-elements of the soft set $(F, E)$.

### Soft Sets

Example

A soft set $(F, E)$ describes the attractiveness of the houses.\
$U$ - set of houses under consideration.\
$E$ - set of parameters.\
$E$ = {expensive, beautiful, wooden, good-surroundings}.\
$F(e)$ - gives the set of houses that have attribute e

### Soft Sets

Matrix Form

$$\bordermatrix{
    \text{(F, E)} & expensive & wooden & beautiful & good-surroundings\cr
    o_1 & 1 & 1 & 1 & 1\cr
    o_2 & 1 & 1 & 0 & 0\cr
    o_3 & 1 & 1 & 1 & 1\cr
    o_4 & 1 & 1 & 0 & 1\cr
    o_5 & 1 & 1 & 1 & 0\cr
    o_6 & 1 & 1 & 0 & 0\cr}$$

### Combination soft and fuzzy sets

-   Fuzzy Soft Set

-   Fuzzy Parameterized Soft Set

-   Fuzzy Parameterized Fuzzy Soft Set

### Related Work

-   Fuzzy Soft Set to crisp Soft Set : $\alpha$-cut

-   Decision making

    -   Aggregation (FS-, FPS-, FPFS-sets)

    -   By Comparision Table

    -   By Fuzzy-Soft Relations

### Proposed Work

-   Defuzzification of fuzzy parameterized fuzzy soft-sets

-   Solving decision making problems with Fuzzy Soft Set Inference
    Systems

### Defuzzification of fuzzy parameterized fuzzy soft-sets

$(F, E)$ is fuzzy parametrized fuzzy soft set describing houses.
$$\bordermatrix{
  \text{(F, E)} & expensive & wooden & beautiful & good-surroundings  \cr
  o_1 & 0.3 & 0.4 & 0.6 & 0.9 \cr
  o_2 & 0.3 & 0.9 & 0.3 & 0.5 \cr
  o_3 & 0.4 & 0.5 & 0.8 & 0.7 \cr
  o_4 & 0.8 & 0.2 & 0.4 & 0.8 \cr
  o_5 & 0.7 & 0.3 & 0.6 & 0.5 \cr
  o_6 & 0.9 & 0.2 & 0.4 & 0.3 }$$

$$\bordermatrix{
  \text{E} & expensive & wooden & beautiful & good-surroundings\cr
  membership & 0.15 & 0.3 & 0.4 & 0.6 }$$

Say the buyer has the following requirements

-   The house should be beautiful at least to a cetain extent.

-   The house should not be in bad surroundings.

-   There are no budget constraints.

-   There is no limit to which the house may be wooden.

This can be formalized as follows: $$\bordermatrix{
  \text{A} &  expensive & wooden & beautiful & good-surroundings\cr
  \alpha & 0 & 0 & 0.6 & 0.5 }$$

On applying $\alpha$-cut with the given values, we get the reduced fuzzy
parametrized soft set $$\bordermatrix{
  \text{(G, B)} & expensive & wooden & beautiful & good-surroundings \cr
  o_1 & 1 & 1 & 1 & 1 \cr
  o_2 &1 & 1 & 0 & 0 \cr
  o_3 &1 & 1 & 1 & 1 \cr
  o_4 &1 & 1 & 0 & 1 \cr
  o_5 &1 & 1 & 1 & 0 \cr
  o_6 &1 & 1 & 0 & 0}$$ $$\bordermatrix{
  \text{A} & expensive & wooden & beautiful & good-surroundings\cr
  membership & 0.15 & 0.3 & 0.4 & 0.6 }$$

### Decision making with Fuzzy Soft Set Inference Systems

The fuzzy soft set (F, A) denotes ’Candidates with Technical skills’,\
$$\bordermatrix{
  \text{(F, A)} & low(a_1) & medium(a_2) & high(a_3)  \cr
  o_1 & 0.5 & 0.2 & 0.1  \cr
  o_2 &0.1 & 0.8 & 0.1  \cr
  o_3 &0.1 & 0.2 & 0.6  \cr
  o_4 &0.2 & 0.25 & 0.3
  }$$

(G, B) denotes ’Candidates with Leadership skills’ and,\
$$\bordermatrix{
  \text{(G, B)} & normal(b_1) & exta-ordinary(b_2)  \cr
  o_1 & 0.2 & 0.4  \cr
  o_2 &0.3 & 0.4   \cr
  o_3 &0.9 & 0.1   \cr
  o_4 &0.2 & 0.6
  }$$

(H, C) denotes ’Candidates with Communication skills’.\
$$\bordermatrix{
  \text{(H, C)} & low(c_1) & medium(c_2) & high(c_3)  \cr
  o_1 & 0.6 & 0.1 & 0  \cr
  o_2 &0.2 & 0.6 & 0.1  \cr
  o_3 &0 & 0.1 & 0.5  \cr
  o_4 &0.3 & 0.4 & 0.3
  }$$

### General Form for rules

If $A$ is $A_0$ and $B$ is $B_0$ then $C$ is $C_0$

Output fuzzy soft sets on mapping some set of rules with input -\
*Suitability for Technical Department*

$$\bordermatrix{
  \text{U} & low & medium & high  \cr
  o_1 & 0.7 & 0.1 & 0  \cr
  o_2 &0 & 0.9 & 0.1  \cr
  o_3 &0.1 & 0.25 & 0.6  \cr
  o_4 &0.2 & 0.4 & 0.35
  }$$

*Suitability for Admininstrative Department*\
$$\bordermatrix{
  \text{U} & low & medium & high  \cr
  o_1 & 0.1 & 0.4 & 0.3  \cr
  o_2 &0.5 & 0.2 & 0.1  \cr
  o_3 &0.6& 0.25 & 0.1  \cr
  o_4 &0.1 & 0.15 & 0.3
  }$$

*Suitability for Human Resources Department*\
$$\bordermatrix{
  \text{U} & low & medium & high  \cr
  o_1  &0.2 & 0.2 & 0.6  \cr
  o_2 &0 & 0.9 & 0.1  \cr
  o_3 &0.3 & 0.2 & 0.1  \cr
  o_4 &0.2 & 0.3 & 0.5
  }$$

### Further Analysis

-   direct decision making from output

-   constructing comparision tables

-   aggregation

### Summary

-   $\alpha$ cut on fuzzy parameterized fuzzy soft sets.

-   A fuzzy inference system for fuzzy soft sets.

### Future Work

The proposed algorithm can be extended for intuitionistic fuzzy soft
sets.
