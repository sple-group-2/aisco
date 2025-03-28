#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.gasdonate --module-path aisco.product.gasdonate -m aisco.product.gasdonate &

wait