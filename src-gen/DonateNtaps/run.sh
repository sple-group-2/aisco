#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.donatentaps --module-path aisco.product.donatentaps -m aisco.product.donatentaps &

wait