#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.donatekuy --module-path aisco.product.donatekuy -m aisco.product.donatekuy &

wait