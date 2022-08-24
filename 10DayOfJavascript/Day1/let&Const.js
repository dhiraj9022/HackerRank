'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function main() {
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.
    var circle_Area=0;
    var circle_Perimeter=0;
    const PI=Math.PI;
    const r= (+readLine());
    circle_Area=PI*r*r;
    
    circle_Perimeter=2*PI*r;
    
    // Print the area of the circle:
     console.log(circle_Area);
    // Print the perimeter of the circle:
    console.log(circle_Perimeter);
    try {    
        // Attempt to redefine the value of constant variable PI
        PI = 0;
        // Attempt to print the value of PI
        console.log(PI);
    } catch(error) {
        console.error("You correctly declared 'PI' as a constant.");
    }
}