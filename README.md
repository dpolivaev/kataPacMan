# KataPacMan

Taken from:
http://codingdojo.org/cgi-bin/index.pl?KataPacMan

## Problem Description

Pacman finds himself in a grid filled with monsters. Will he be able to eat all the dots on the board before the monsters eat him?

Incomplete list of things the game needs:

 * pacman is on a grid filled with dots
 * pacman has a direction
 * pacman moves on each tick
 * user can rotate pacman
 * pacman eats dots
 * pacman wraps around
 * pacman stops on wall
 * pacman will not rotate into a wall
 * game score (levels completed, number of dots eaten in this level)
 * monsters...
 * levels
 * animate pacman eating (mouth opens and closes)

## Clues

Pacman looks continuous, however the game state changes in discrete steps. Creating a tick() method/function or somesuch, or passing a board to a function which returns a 'next state' board makes it easy to test the various conditions.

