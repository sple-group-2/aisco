#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.pedulisesama --module-path aisco.product.pedulisesama -m aisco.product.pedulisesama &

wait