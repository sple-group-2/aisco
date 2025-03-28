#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.berbagirasa --module-path aisco.product.berbagirasa -m aisco.product.berbagirasa &

wait