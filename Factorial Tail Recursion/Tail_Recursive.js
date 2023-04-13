function factTR(n, a) {
  if (n <= 0) return a;

  return factTR(n - 1, n * a);
}

// A wrapper over factTR
function fact(n) {
  return factTR(n, 1);
}

// Driver code
// console.log(fact(10));
// console.log(fact(100));
// console.log(fact(500));
// console.log(fact(12002));
// console.log(fact(10400));
// console.log(fact(10100));
